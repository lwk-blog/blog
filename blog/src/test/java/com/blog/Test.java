package com.blog;

import java.io.File;

/**
 * Created by dell on 2020/11/28.
 */
public class Test {

    public static void main(String[] args) {

        String path = Test.class.getResource("/").getPath();

        File file = new File(path);

        System.out.println(file.getPath());//E:\TravelAgency_TestVersion\Project\WebRoot\WEB-INF\classes

        String path2 = file.getParentFile().getParentFile().getPath();

        System.out.println(path2);//E:\TravelAgency_TestVersion\Project\WebRoot

    }
}
