package sec02;

public class Example1 {
    public static void main(String[] args) {
        //반복문 : 일부의 문장을 반복하여 처리해야 하는 경우활용
        //1~100의 합계를 구할 경우에 더하는 문장 100줄을 넣는 것보다 반복문을
        //활용하는 것이 훨씬 효과적임.
        //i++; 를 100번 넣는 것보다 for(int i=0;i<=100; i++){ }으로
        //처리하는 것이 좋다.
        //반복문의 종류 : for~, while~, do~while
        // for(카운트변수선언및초기화;조건;증감식) { 문장;}
        //해당 지정된 값부터 조건이 만족하는 동안만 증감되면서 실행
        int sum = 0;
        for(int i=0;i<=10;i++){
     //       sum+1=i; //sum=sum+i;
        }
        //for(ㄱ.int i=0;ㄴ.i<=10;ㄷ.i++){
        //    ㄹ.sum+1=i;  ㄱ>ㄴ>ㄹ>ㄷ>ㄴ>ㄹ>ㄷ>...ㄴ>ㄹ>ㄷ>ㄴ
        //sum=0+1+2+3+4+5+6+7+8+9+10+......+100
        //5050
        //무한 루프 : for(;;){  }
        System.out.println("합산 결과="+sum);

        //int arr[] {90, 80, 85, 75, 95};
        //         arr[0], arr[1], ... , arr[4] -> 인덱스(순번)

        //String tot1 = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        int tot2 = 0;
        //for(int i=0;i<arr.length;i++){
        //    tot2+=arr[i];
        }
        //System.out.println("tot1" + ="=tot1);
        //System.out.println("tot2="=tot2);
        
        int b =1;
        int hap = 0;
        //for(;;){
           // hap+=b;
           // b+=2;
           // if(b<=100) break;}
       // System.out.println("홀수의 합2 : " +hap);
        
       // hap=0;
        //for(int c=1;c<=100;c++){
           // if(c%2==1){
              //  hap+=c;
           // }else{
            //    continue;
            }
       // }
   // }
//}
