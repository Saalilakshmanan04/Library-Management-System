// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayList;
import java.util.Iterator;

class Library {
   private ArrayList<Book> books = new ArrayList();

   Library() {
   }

   public void addBook(Book var1) {
      this.books.add(var1);
      System.out.println("Book added successfully.");
   }

   public void displayBooks() {
      if (this.books.isEmpty()) {
         System.out.println("No books available.");
      } else {
         System.out.println("Books in Library:");
         Iterator var1 = this.books.iterator();

         while(var1.hasNext()) {
            Book var2 = (Book)var1.next();
            System.out.println(var2);
         }

      }
   }

   public void searchBook(String var1) {
      boolean var2 = false;
      Iterator var3 = this.books.iterator();

      while(var3.hasNext()) {
         Book var4 = (Book)var3.next();
         if (var4.getTitle().equalsIgnoreCase(var1)) {
            System.out.println("Found: " + var4);
            var2 = true;
         }
      }

      if (!var2) {
         System.out.println("Book not found.");
      }

   }

   public void removeBook(int var1) {
      boolean var2 = this.books.removeIf((var1x) -> {
         return var1x.getId() == var1;
      });
      if (var2) {
         System.out.println("Book removed successfully.");
      } else {
         System.out.println("Book not found.");
      }

   }
}
