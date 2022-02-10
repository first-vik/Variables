package com.max.idea;

public class Variables {

    public static void main (String[] args) {
      int myInt = 155;
      short myShort = 32767;
      long myLong = -515555;
      double myDouble = 196.25;
      float  myFloat = 8.5F;
      char c = 'r';
      boolean b = false;
      byte myByte = -22;
      String var = String.format("%s,%s,%s,%s,%s,%s,%s,%s", myInt,myShort,myLong,myDouble,myFloat,c,b,myByte);
      System.out.println(var);
    }
}