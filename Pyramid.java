class Pyramid{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
for(int i=0;i<n;i++)
for(int j=0;j<i;j++){
System.out.print(i+"\t");
}
System.out.println("\n");
}
}

