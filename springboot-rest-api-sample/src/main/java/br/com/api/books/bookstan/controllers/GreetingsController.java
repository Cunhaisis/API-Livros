package br.com.api.books.bookstan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.books.bookstan.model.Livro;
import br.com.api.books.bookstan.repository.LivroRepository;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
	
	@Autowired
	private LivroRepository livroRepository;
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Meus Livros " + name + "!";
    }
    
    @RequestMapping(value = "/livros/{nome}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String OlaMundo(@PathVariable String nome) {
    	
    	return "Ultimos livros lidos: " + nome;
    	
    }
    
    @GetMapping(value = "listatodos")
    @ResponseBody
    public ResponseEntity<List<Livro>> listaLivro() {
    	
    	List<Livro> livros = livroRepository.findAll();
    	
    	return new ResponseEntity<List<Livro>>(livros, HttpStatus.OK);
    }
    
    @PostMapping(value = "salvar")
    @ResponseBody
    public ResponseEntity<Livro> salvar(@RequestBody Livro livro) {
    	
    	Livro book = livroRepository.save(livro);
    	
    	return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
}
