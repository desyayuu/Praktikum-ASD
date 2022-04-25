import java.util.Scanner;
class Postfix{
    int n, top;
    char [] stack;

    public Postfix(int total){
        n= total;
        top=-1;
        stack=new char[n];
        push('(');
    }
    public void push(char c){
        top++;
        stack[top]=c;
    }
    public char pop(){
        char item = stack[top];
        top--;
        return item; //ini item yg baru, top baru
    }
    public boolean IsOperand(char c){
        if((c>='A' && c<='Z')|| c>='a' && c<='z'|| c>='0' && c<='9'|| c==' ' || c == '.'){
            return true;
        }else {
            return false;
        }
    }
    public boolean IsOperator(char c){
        if(c=='^'|| c=='%'||c=='/'||c=='*'||c=='-'||c=='+'){
            return true;
        }else {
            return false;
        }
    }
    public int derajat(char c){
        switch (c){
            case '^':
                return 3;//nunjukin derajat dia paling tinggi
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }
    public String konversi(String Q){//a+2*b
        String p = "";//diisi karakter yang dimasukkan //P ="a", P="a2"
        char c; //inputan terus dimasukin ke p
        for(int i =0; i<n; i++){
            c=Q.charAt(i);//scanning perkarakter
            if(IsOperand(c)){
                p = p+c;
            }
            if(c=='('){
                push(c);//untuk mendahulukan
            }
            if(c==')'){
                while(stack[top]!='('){// a + (b*(2+c))
                    p=p+pop();
                }
                pop();
            }
            if(IsOperator(c)){
                while(derajat(stack[top])>=derajat(c)){
                    p=p+pop();
                }
                push(c);
            }
        }
        return p;
    }
}
public class PostfixDanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P,Q;
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q=sc.nextLine();
        Q=Q.trim();
        Q=Q+")";
        int total = Q.length();

        Postfix post = new Postfix(total);
        P=post.konversi(Q);
        System.out.println("Postfix: " +P);
    }
}
