public class CodeRemoveCharacter
{
    public static void main(String[] args)
    {
        String stringVar = "Hello Codeunderscored";
        System.out.println("The string before removing character: " + stringVar);
        stringVar = stringVar.replace(" ", "");
        System.out.println("The string after removing character: " + stringVar);
    }
}