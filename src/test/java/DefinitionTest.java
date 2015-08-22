import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("feeling or showing contentment");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void definition_instantiatesWithDescription_true() {
    Definition myDefinition = new Definition("feeling or showing contentment");
    assertEquals("feeling or showing contentment", myDefinition.getDescription());
  }
//
  // @Test
  // public void all_returnsAllInstancesOfDefinition_true() {
  //   Definition firstDefinition = new Definition("feeling or showing contentment");
  //   Definition secondDefinition = new Definition("feeling or showing sorrow");
  //   assertTrue(Definition.all().contains(firstDefinition));
  //   assertTrue(Definition.all().contains(secondDefinition));
  // }
//
  // @Test
  // public void newId_DefinitionsInstantiateWithAnID_true() {
  //   Definition myDefinition = new Definition("feeling or showing contentment");
  //   assertEquals(Definition.all().size(), myDefinition.getId());
  // }
//
//   @Test
//   public void find_returnsDefinitionWithSameId_secondDefinition() {
//     Definition firstDefinition = new Definition("feeling or showing contentment");
//     Definition secondDefinition = new Definition("feeling or showing sorrow");
//     assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
//   }
//
//   @Test
//   public void find_returnsNullWhenNoDefinitionFound_null() {
//     assertTrue(Definition.find(999) == null);
//   }

  // @Test
  // public void clear_emptiesAllDefinitionsFromArrayList() {
  //   Definition myDefinition = new Definition("feeling or showing contentment");
  //   Definition.clear();
  //   assertEquals(Definition.all().size(), 0);
  // }
}
