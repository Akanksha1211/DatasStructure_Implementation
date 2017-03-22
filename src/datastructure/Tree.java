/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author aavha
 */
public class Tree {

    public TreeNode root;

    Tree() {
        this.root = null;
    }

    
    public void insert(int a) {
        TreeNode currentNode = root;
        TreeNode parentNode = root;
        if (root == null) {
            root = new TreeNode(a);
        } else {
            while (currentNode != null) {
                //place to insert
                parentNode = currentNode;
                if (currentNode.getData() > a) {
                    currentNode = currentNode.getLeft();
                } else {
                    currentNode = currentNode.getRight();
                }
            }
            if (parentNode.getData() > a) {
                parentNode.setLeft(new TreeNode(a));
            } else {
                parentNode.setRight(new TreeNode(a));
            }

        }
    }
       
    public void printNode(TreeNode currentNode) {

        if (currentNode == null) {
            return;

        } else {
            printNode(currentNode.getLeft());
            System.out.print(currentNode.getData() + " ");
            printNode(currentNode.getRight());
        }

    }

    public void inorderPrint() {
        TreeNode currentNode = root;
        if (root == null) {
            System.out.println("Empty list");
        } else {
            printNode(currentNode);
        }

    }

    public void delete(int a) {
        TreeNode currentNode = root;
        TreeNode parentNode = root;
        if (root == null) {
            System.out.println("Empty Tree");
        }
        if (currentNode.getData() == a && currentNode.getLeft() == null && currentNode.getRight() == null) {
            root = null;
            return;
        }

        while (currentNode != null) {
            if (currentNode.getData() == a) {
                //When currentNode doesnot have left child
                if (currentNode.getLeft() == null && currentNode!=root) {
                    parentNode.setRight(currentNode.getRight());
                    break;
                }
                //When currentNode doesnot have right child
                if (currentNode.getRight() == null && currentNode!=root) {
                    parentNode.setLeft(currentNode.getLeft());
                    break;
                }
                //when currentNode doesnot have any child on both side
                if (currentNode.getRight() == null && currentNode.getLeft() == null) {
                    if (parentNode.getLeft() == currentNode) {
                        parentNode.setLeft(null);
                    } else {
                        parentNode.setRight(null);
                    }
                    break;
                }
                //when currentNode contains both side Left and Right Node
                if (currentNode.getRight() != null && currentNode.getLeft() != null) {
                    // TreeNode currentNodeLeftNode=currentNode.getLeft();
                    TreeNode currentNodeRightNode = currentNode.getRight();
                    //if the child on left side doesnot have a right node
                    if (currentNode.getLeft().getRight() == null) {
                        TreeNode currentNewNode = currentNode.getLeft();
                        parentNode.setLeft(currentNewNode);
                        currentNewNode.setRight(currentNodeRightNode);
                    } else {
                        //Find the max value on right side and replace with the node to be deleted
                        TreeNode rightNode = currentNode.getLeft();

                        TreeNode childParentNode = currentNode.getLeft();

                        while (rightNode.getRight() != null) {
                            childParentNode = rightNode;
                            rightNode = rightNode.getRight();

                        }
                        childParentNode.setRight(null);
                        rightNode.setRight(currentNode.getRight());
                        rightNode.setLeft(currentNode.getLeft());
                        parentNode.setLeft(rightNode);
                    }

                }

                break;

            } else if (currentNode.getData() > a && currentNode.getLeft() != null) {
                parentNode = currentNode;
                currentNode = currentNode.getLeft();
                //  System.out.print(currentNode.getData() +" ");
            } else if (currentNode.getData() <= a && currentNode.getRight() != null) {
                parentNode = currentNode;
                currentNode = currentNode.getRight();
                //  System.out.print(currentNode.getData() +" ");
            } else {
                System.out.print("Not Found");
                break;
            }

        }

    }
}
