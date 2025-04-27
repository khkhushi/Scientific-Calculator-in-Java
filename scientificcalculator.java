class scientificcalculator 
{
   double s(double x)
   {   
       double res;
       double res=Math.sin(v);
   }
   double c(double x)
   {
      double res;
     double res=Math.sin(v);
   }
   double t(double x)
   {
      double res;
     double res=Math.tan(v);
   }
  double as(double x)
   {
     double res;
     double res=Math.asin(v);
   }
   double ac(double x)
   {
     double res;
     double res=Math.acos(v);
   }
   double at(double x)
   {
     double res;
     double res=Math.atan(v);
   }
  double cuberoot(double x)
   {
     double res;
     double res=Math.cbrt(v);
   }
   double squreroot(double x)
   {
     double res;
     double res=Math.sqrt(v);
   }
   double logothoriun(double x)
   {
     double res;
     double res=Math.log10(v);
   }
   public static void main(String args[])
    { System.out.println(“enter your choice”);
                   System.out.println(“ 1.  sin”);
                   System.out.println(“2. cos”);
                   System.out.println(“ 3. tan”);
                   System.out.println(“4. inverse sin”); 
                   System.out.println(“5 inverse cos. ”);
                   System.out.println(“ 6 inverse tan”);
                   System.out.println(“7 cube root”);
                   System.out.println(“ 8 log ”);
                   System.out.println(“9 square root”);
                   Scanner sc = new Scanner(System.in);
                    int kh3 = sc.nextint();
                     switch(kh3)
                      {
                         case1:
                                 { obj.s(4);
                                   break;
	                         }
                         case2:
                                 {obj.c(9);
                                  break;
                                 }
                          case3:
                                { obj.t(6);
                                    break;
                                 }
                          case4:
                                 { obj.as(5);
                                   break;
	                         }
                         case5:
                                 {obj.ac(9);
                                  break;
                                 }
                          case6:
                                { obj.at(8);
                                    break;
                                 }
                            case7:
                                 { obj.cuberoot(45);
                                   break;
	                         }
                         case8:
                                 {obj.squareroot(67);
                                  break;
                                 }
                          case9:
                                { obj.logothoriun(4);
                                    break;
                                 }
              }
       }
}

