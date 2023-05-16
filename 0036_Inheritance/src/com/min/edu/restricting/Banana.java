package com.min.edu.restricting;


// Banana  클래스는 상위 부모클래스(Fruit) 에서 
// permits 하지 않았기 때문에 사용기 불가능하다
// public sealed interface Fruit permits Orange, Lemon에 
//   마지막에  Banana 클래스를 추가해 줘야 한다
public  final class Banana implements Fruit{

}
