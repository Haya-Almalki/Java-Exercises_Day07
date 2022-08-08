public class TestBook {
    public static void main(String[] args) {
        Author a1=new Author("Haya","Haya@gmail.com",'f');
        Author a2=new Author("Abdulla","Abdulla@gmail.com",'m');
        Author[]authors={a1,a2};
        Book b1=new Book("Java",authors,100);
        System.out.println(b1.getName());
        System.out.println(b1.getPrice());
        System.out.println(b1.getAuthorNames());
        System.out.println(b1);

    }
}
