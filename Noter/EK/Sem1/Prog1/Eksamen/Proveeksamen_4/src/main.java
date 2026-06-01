public class main {
    public static void main(String[] args) {
        Keyword java = new Keyword("Java", "et Prog sptog");
        Keyword mad = new Keyword("Mad", "Det man spiser");

        System.out.println(java.getWord());
        System.out.println(java.getDefinition());

        System.out.println(java);

        java.addToSeeAlso(mad);
        System.out.println(java.seeAlso());

        System.out.println(java.matches("Java"));
        System.out.println(java.matches("java"));
        System.out.println(java.matches("mad"));
    }

}
