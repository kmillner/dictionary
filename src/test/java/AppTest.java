// import org.fluentlenium.adapter.FluentTest;
// import org.junit.ClassRule;
// import org.junit.Test;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.htmlunit.HtmlUnitDriver;
// import static org.assertj.core.api.Assertions.assertThat;
// import static org.fluentlenium.core.filter.FilterConstructor.*;
//
// public class IntegratedTest extends FluentTest {
//   public WebDriver webDriver = new HtmlUnitDriver();
//
//   @Override
//   public WebDriver getDefaultDriver() {
//     return webDriver;
//   }
//
//   @ClassRule
//   public static ServerRule server = new ServerRule();
//
//   @Test
//   public void rootTest() {
//     goTo("http://localhost:4567/");
//     assertThat(pageSource()).contains("Word");
//     }
//
//   @Test
//   public void wordIsCreatedTest() {
//     goTo("http://localhost:4567/");
//     fill("#name").with("happy");
//     submit(".btn");
//     assertThat(pageSource()).contains("New Word Added.");
//   }
//
//   @Test
//   public void wordIsDisplayedTest() {
//     goTo("http://localhost:4567/");
//     fill("#name").with("happy");
//     submit(".btn");
//     click("a", withText("Go Back"));
//     assertThat(pageSource()).contains("happy");
//     }
//
//     @Test
//   public void wordIsDisplayedTest() {
//       goTo("http://localhost:4567/words/new");
//       fill("#name").with("happy");
//       submit(".btn");
//       click("a", withText("View words"));
//       assertThat(pageSource()).contains("happy");
//      }
//
//     /* @Test
//   public void multipleWordsAreDisplayedTest() {
//       goTo("http://localhost:4567/words/new");
//       fill("#name").with("happy");
//       submit(".btn");
//       goTo("http://localhost:4567/words/new");
//       fill("#name").with("sad");
//       submit(".btn");
//       click("a", withText("View words"));
//       assertThat(pageSource()).contains("happy");
//       assertThat(pageSource()).contains("sad");
//      }
//
//      @Test
//   public void wordShowPageDisplaysName() {
//       goTo("http://localhost:4567/words/new");
//       fill("#name").with("happy");
//       submit(".btn");
//       click("a", withText("View words"));
//       click("a", withText("happy"));
//       assertThat(pageSource()).contains("happy");
//      }
//
//      @Test
//   public void wordNotFoundMessageShown() {
//       goTo("http://localhost:4567/tasks/999");
//       assertThat(pageSource()).contains("Word not found");
//    }*/
//
//      }
