public class Testprimate {
   public static void main(String [] args) {
      
      Primate primate1 = new Primate();
      primate1.name = "Curious George";
      primate1.species = "Monkey";
      primate1.size = "Small";
      primate1.colour = "Brown";
      primate1.favFood = "Bananas";
      primate1.age = 75;
      primate1.weight = 20;
      primate1.sex = 'M';
      primate1.aggressive = false;
      
      primate1.sleep(7.5);
      
      System.out.println("");
      primate1.climb("tree", 34);
      
      System.out.println("");
      primate1.communicate("oo aa oo aa");
      
      System.out.println("\nThe " + primate1.species + "'s name is " + primate1.name);
      System.out.println("The " + primate1.species + " is " + primate1.size + " and " + primate1.colour);
      System.out.println(primate1.name + " is " +  primate1.age + " years old and " + primate1.weight + "kg.");
      
      
   }
}