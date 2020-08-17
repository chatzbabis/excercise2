package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.company.InsertNumber.insertPhone;
import static com.company.InsertNumber.internationalOrDomestic;


public class Main {

    public static void main(String[] args) {
// //       Node phone=new Node(new Integer(210));
////        phone.addChild(new Node(158));
////        //phone.addChild(new Node(5));
////        List<Integer> paths= new ArrayList<Integer>();
////        Node.printAllRootToLeafPaths(phone,paths);
////
////        System.out.println("*****************************");
////
////        Set<Node> allLeafNodes=phone.getAllLeafNodes();
////        for (Node leafNode:allLeafNodes) {
////            leafNode.addChild(new Node(5),0);
////            //leafNode.addChild(new Node(263));
////
////
////        }
////        Set<Node> allLeafNodes2=phone.getAllLeafNodes();
////        for (Node leafNode:allLeafNodes2) {
////           // leafNode.addChild(new Node(5));
////            leafNode.addChild(new Node(263),0);
////
////
////        }
////        List<Integer> paths2= new ArrayList<Integer>();
////        Node.printAllRootToLeafPaths(phone,paths2);
//
//        System.out.println("*********************************************************");
//        System.out.println();
//        List<Integer> phone=new ArrayList<Integer>();
//        phone.add(2);
//        phone.add(10);
//        phone.add(6);
//        phone.add(9);
//        phone.add(30);
//        phone.add(6);
//        phone.add(6);
//        phone.add(4);
//        interpretations(phone);
//
//        System.out.println("*********************************************************");
//        System.out.println();
//        List<Integer> phone2=new ArrayList<Integer>();
//        phone2.add(2);
//        phone2.add(10);
//        phone2.add(6);
//        phone2.add(97);
//        phone2.add(3);
//        phone2.add(10);
//
//        interpretations(phone2);
//
//        System.out.println("------------------------------------------------------------");

        String phone=insertPhone();


        internationalOrDomestic(phone);


        //System.out.println(phoneNumbersInList);


    }



}
