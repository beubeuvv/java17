package sec1;

public class Example5 {
    public static void main(String[] args) {
        byte b1 = 104;
        //byte b2 = -129; 해당 표현범위보다 적음(언더플로우)
        //byte b3 = 128; 해당 표현범위보다 크면(오버플로우)

        char c1 = 'k';
        //char c2 = -1; 언더플로우
        //char c3 = 65536; 오버프로우

        short s1 = 365;
        //short s2 = -32769; 언더플로우
        //short s3 = 32768;  오버플로우

        long l1 = 1225;
        //long l2 = -9223372036854775809; 언더플로우
        //long l3 =  9223372036854775808; 오버플로우

        float f1 = 3.141592f;
        //float f2 = -2147483649; 언더플로우
        // float f3 = 2147483649; 오버플로우

        double d1 = 3.141592;
        //double d2 =-9223372036850000000000000000000000언더플로우
        //double d3 =9223372036850000000000000000000000오버플로우

        int i1 = 2100000000;
        //int i2 = -2147483649;언더플로우
        //int i2 = 2147483648;오버플로우







    }
}