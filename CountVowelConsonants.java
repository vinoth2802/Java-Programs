import java.util.Scanner;

public class CountVowelConsonants {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence=s.nextLine();
        sentence.toLowerCase();
        int vowels=0;
        int consonants=0;
        int i=0;
        do{
            char ch=sentence.charAt(i);
            if(ch==' ')
            {
                i++;
                continue;
            }
            else if(ch>='a'&&ch<='z')
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowels++;
                else
                    consonants++;
            }
            i++;
        }while (i<sentence.length());
        System.out.println("Number of vowels: "+vowels);
        System.out.println("Number of consonants: "+consonants);
        s.close();
    }

}
