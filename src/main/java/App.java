//I kept running into errors and I will come back to this after I've taken a nap...
// But at least I tried! :D


import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args){
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("words", request.session().attribute("words"));
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/wordsmade", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      ArrayList<Word> words = request.session().attribute("words");

      if (words == null){
        words = new ArrayList<Word>();
        request.session().attribute("words", words);
      }

      String wordName = request.queryParams("words");
      Word newWord = new Word(wordName);
      //newWord.save();
      // words.add(newWord);
      words.add(newWord);
      model.put("template", "templates/wordmade.vtl");
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());

    get ("/word/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      //Word newList = Word.find(Integer.parseInt(request.params(":id")));
      //model.put("wordList", wordList);
      model.put("words", request.session().attribute("words"));
      model.put("template", "templates/words.vtl");
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());

    get ("/word/:id/words/new", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Word word = Word.find(Integer.parseInt(request.params(":id")));
      ArrayList<Definition> definition = word.getDefintion();
      model.put("word","word");
      model.put("definitions", definitions);
      model.put("template", "templates/word-definition-form.vtl");
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());

    post("/definitions", (request, response) ->
    //HashMap<String, Object> model = new HashMap<String, Object>();

    //Word word = Word.find(Integer.parseInt(request.queryParams("wordId"));
    // ArrayList<Word> words = request.session().attribute("words");
    //
    // get ("/word",(request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   model.put("words", request.session().attribute("words"));
    //   model.put("template", "templates/word.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());

    post("/success", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      ArrayList<Word> words = request.session().attribute("words");

          if (words == null){
          words = new ArrayList<Word>();
          request.session().attribute("words", words);
        }

      String wordName = request.queryParams("word");
      String definitionType = request.queryParams("definition");
      //Word newWord = new Word(wordName, definitionName);
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine();
  }
}
