import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,t=0,i=0;
        String userDetails;
        User userArray[],user = new User();
        System.out.println("Enter Total Number Of Users");
        n = scan.nextInt();
        userArray = new User[n];
        System.out.println("Enter User Details");
        while(i<n)
        {
            userDetails= scan.next();
            String s[] =userDetails.split(",");
            user.setUserName(s[0]);
            user.setFirstName(s[1]);
            user.setLastName(s[2]);
            user.setContact(s[3]);
            userArray[i]=user;
            i++;
        }
        System.out.println("Choose An Option");
        System.out.println("1.\\t Search user by user name");
        System.out.println("2.\\t Search user by first name and last name");
        t= scan.nextInt();
        if(t==1){
            System.out.println("Enter the UserName to Search");
            String username=scan.next();
            user =new User();
            User user1 =user.findUser(userArray,username);

            System.out.println(user1!=null?user1.toString():"Not Found");

        }
        else if(t==2)
        {
            System.out.println("Enter the FirstName and LastName to Search");
            String s = scan.next();
            String[] str =s.split(",");
            user =new User();
            User user1 =user.findUser(userArray,str[0],str[1]);
            System.out.println(user1!=null?user1.toString():"Not Found");
        }



    }
}
