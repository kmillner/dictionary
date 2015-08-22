import java.util.ArrayList;

public class Definition{

  //private static ArrayList<Definition> instances = new ArrayList<Definition>();

  private String mDescription;
  private ArrayList<Word> mWords;
  private int mId;

  public Definition(String description) {
    mDescription = description;
    // mDefinition = new ArrayList<Definition>();
    //instances.add(this);
    // mId = instances.size();
  }

  public String getDescription(){
    return mDescription;
  }

  public int getId() {
    return mId;
  }
}

//   public String getDescription() {
//     return mDescription;
//   }

  // public void completeDefinition() {
  //   mCompleted = true;
  // }
/*
  public static ArrayList<Definition> all() {
    return instances;
  }

  public static Definition find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }*/
