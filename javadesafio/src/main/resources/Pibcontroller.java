package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.PibEntity;
import entity.PibRepository;

@RequestMapping("dividaliquida")
@RestController
public class TopicosController {
	
	@Autowired
	private PibRepository pibRepository;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET )
	public Optional<PibEntity> listar(Integer id){
		return pibRepository.findById(id);
		
		}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE )
	public void deletar(Integer id){
		pibRepository.deleteById(id);
		
		}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET )
	public List<PibEntity> listarTodos(){
		return pibRepository.findAll();
	
		}
}
