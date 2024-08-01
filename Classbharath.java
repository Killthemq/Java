class bharath
{
bharath(int n) {
int sum = 0;
for (int i = 1; i <= n; i++) {
sum += i;
}
System.out.println("bharath's sum of series up to " + n + " is: " + sum);
}

public static void main(String[] args) {
 bharath bharath= new bharath(5);
}
}
