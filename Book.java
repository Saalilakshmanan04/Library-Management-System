// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Book {
   private int id;
   private String title;
   private String author;

   public Book(int var1, String var2, String var3) {
      this.id = var1;
      this.title = var2;
      this.author = var3;
   }

   public int getId() {
      return this.id;
   }

   public String getTitle() {
      return this.title;
   }

   public String getAuthor() {
      return this.author;
   }

   public String toString() {
      return "Book ID: " + this.id + ", Title: " + this.title + ", Author: " + this.author;
   }
}
