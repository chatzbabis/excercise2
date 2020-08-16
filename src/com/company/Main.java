package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
 //       Node phone=new Node(new Integer(210));
//        phone.addChild(new Node(158));
//        //phone.addChild(new Node(5));
//        List<Integer> paths= new ArrayList<Integer>();
//        Node.printAllRootToLeafPaths(phone,paths);
//
//        System.out.println("*****************************");
//
//        Set<Node> allLeafNodes=phone.getAllLeafNodes();
//        for (Node leafNode:allLeafNodes) {
//            leafNode.addChild(new Node(5),0);
//            //leafNode.addChild(new Node(263));
//
//
//        }
//        Set<Node> allLeafNodes2=phone.getAllLeafNodes();
//        for (Node leafNode:allLeafNodes2) {
//           // leafNode.addChild(new Node(5));
//            leafNode.addChild(new Node(263),0);
//
//
//        }
//        List<Integer> paths2= new ArrayList<Integer>();
//        Node.printAllRootToLeafPaths(phone,paths2);

        System.out.println("*********************************************************");
        System.out.println();
        List<Integer> phone=new ArrayList<Integer>();
        phone.add(2);
        phone.add(10);
        phone.add(6);
        phone.add(9);
        phone.add(30);
        phone.add(6);
        phone.add(6);
        phone.add(4);
        interpretations(phone);

        System.out.println("*********************************************************");
        System.out.println();
        List<Integer> phone2=new ArrayList<Integer>();
        phone2.add(2);
        phone2.add(10);
        phone2.add(6);
        phone2.add(97);
        phone2.add(3);
        phone2.add(10);

        interpretations(phone2);
    }

    public static void interpretations(List<Integer> phone){

        if (phone.get(0)==2) {
            Node root = new Node(phone.get(0));
            root.addSingleChild(new Node(phone.get(1)));


            for (int i = 2; i < phone.size(); i++) {

                Set<Node> allLeafNodes=root.getAllLeafNodes();
                for (Node leafNode:allLeafNodes) {
                    if (i==phone.size()-1){
                        leafNode.addChild(new Node(phone.get(i)),0);

                    }else {
                        if (!leafNode.isAddToLeafNode()) {
                            leafNode.setAddToLeafNode(true);
                            continue;
                        }
                        leafNode.addChild(new Node(phone.get(i)), phone.get(i + 1));
                        //leafNode.addChild(new Node(263));

//                        if (phone.get(i)%10==0 && phone.get(i+1)<10){
//                            System.out.println("edw");
//                            i++;
//                        }

                    }


                }


            }
            List<Integer> paths= new ArrayList<Integer>();
            Node.printAllRootToLeafPaths(root,paths);
        }


    }

}
