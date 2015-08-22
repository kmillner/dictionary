import org.junit.*;
import static org.junit.Assert.*;
// import org.junit.Test;
// import java.util.ArrayList;

public class WordTest {

  // @Rule
  // public ClearRule clearRule = new ClearRule();

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("happy");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void word_instantsWithWord_true() {
    Word myWord = new Word ("happy");
    assertEquals("happy", myWord.getName());
  }
//
//   @Test
//   public void getId_returnsWordId() {
//     Word testWord = new Word("happy");
//     assertTrue(Word.all().size() == testWord.getId());
//   }
//
//   @Test
//   public void getWords_initiallyReturnsEmptyArrayList() {
//     Word testWord = new Word("happy");
//     assertTrue(testWord.getTasks() instanceof ArrayList);
//   }
//
  // @Test
  // public void all_returnsAllInstancesOfDefinition_true() {
  //   Word firstWord = new Word("happy");
  //   Word secondWord = new Word("sad");
  //   assertTrue(Word.all().contains(firstWord));
  //   assertTrue(Word.all().contains(secondWord));
  // }
//
//   @Test
//   public void clear_removesAllWordInstancesFromMemory() {
//     Word testWord = new Word("Home");
//     Word.clear();
//     assertEquals(Word.all().size(), 0);
//   }
//
//   @Test
//   public void find_returnsWordWithSameId() {
//     Word testWord = new Word("Home");
//     assertEquals(Word.find(testWord.getId()), testWord);
//   }
//
//   @Test
//   public void addDefinition_addsDefinitionToList() {
//     Word testWord = new Word("happy");
//     Definition testDefinition = new Definition("feeling or showing contentment");
//     testWord.addDefinition(testDefinition);
//     assertTrue(testWord.getDefinitions().contains(testDefinition));
//   }
}
