void main (){
    IO.println("FindMax");
    int a = 15;
    int b = 5;
    int c = 12;
    int max = 0;
    if((a>b )&& (a>c)){
         max =a;
    }
    else if ((b>a) && (b>c)){
        max = b;
    }
    else 
        max =c;
   IO.println("Max :"+max);
}