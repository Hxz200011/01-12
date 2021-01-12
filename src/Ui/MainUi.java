package Ui;

import Plane.make.ticket.Flight;

import java.util.Scanner;
import java.util.UUID;

public class MainUi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){

            System.out.println("请输入相应的数字进行操作:");
            System.out.println("请按1，录入航班信息:");
            System.out.println("按2，显示所有航班信息:");
            System.out.println("按3，查询航班信息:");
            System.out.println("按4，机票预订:");
            System.out.println("按6，退出系统:");

            String id= UUID.randomUUID().toString();
            System.out.println(id.replace("-",""));
            System.out.println("请输入航班编号：");
            String flightID=sc.next();
            System.out.println("请输入机型：");
            String planeType=sc.next();
            System.out.println("请输入座位数：");
            int flightIDcurrentseatsnumber=sc.nextInt();
            System.out.println("请输入起飞机场：");
            String departureAirport=sc.next();
            System.out.println("请输入目的机场：");
            String destinationAirPort=sc.next();
            System.out.println("请输入起飞时间：");
            String departureTime=sc.next();

            Flight flight=new Flight( id,
                    departureAirport,departureTime,destinationAirPort)



        }
    }

}
