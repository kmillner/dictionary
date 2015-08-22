import java.util.ArrayList;

public class Word{
  private static ArrayList<Word> instances = new ArrayList<Word>();

  private String mName;
  private ArrayList<Word> mDefinitions;
  private int mId;

public Word(String name) {
   mName = name;
   instances.add(this);
   mId = instances.size();
  //  mDefinitions = new ArrayList<Definition>();
 }

 public String getName(){
  return mName;
}

// public ArrayList<Definition> getDefinitions() {
//   return mDefinitions;
// }

// public static ArrayList<Word> all() {
//    return instances;

// public int getId() {
//      return mId;
//  }

// public void addDefinition(Definition definition) {
//   mDefinitions.add(definition);
// }
//
// public static void clear() {
//   instances.clear();
// }
//
// public static Word find(int id){
//     try {
//        return instances.get(id - 1);
//      } catch (IndexOutofBoundsException e) {
//        return null;
//      }
  //  }
 // }
 }
