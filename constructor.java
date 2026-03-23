public class constructor {
    int x,y;
    constructor(int a, int b){
        x=a;
        y=b;
    }
    constructor(constructor ob){
        x =ob.x;
        y = ob.y;
    }
    public static void main(String[] args) {
        constructor ob = new constructor(1,2);
        constructor ob1 = new constructor(ob); //By passing Objects
        constructor ob2 = ob1; //Drect Copy
    }
}
