public class sort<S>
{
  privat item a[];
  public sort()
   {
   a=(item[])new as[10];
    
   }
   Public void insert(item x)
    {
     a[]=x;
     for(int i = a.length; i > 1; i--)
      {
         for(int j = 0; j < i - 1; j++)
         {
           if(a[j] > a[j+1])
            {
              item temp = a[j];
              a[j] = a[j+1];
              a[j+1] = temp;
            }
          }
        }
       public void show()
      {
        System.out.println(a[]+"->");
      }  
    }
}


class Q2_BubbleSort
 {
  public static void main (String a[])
   { 
     Sort <Integer> s = new sort<Integer>();
     s.insert(20);
     s.insert(30);
     s.insert(40);
     s.insert(50);
     s.insert(60);
     s.insert(70);
     s.show();
     //System.out.println("Size of the stack: " + s.size());
     //System.out.println("Following items are poped from Integer stack:");
     Sort <String> c = new Sort<String>();
     c.insert("India");
     c.insert("China");
     c.insert("USA");
     c.show();
  }
}