package hello;

import hello.Data.LoanEvent;
import hello.Data.LoanEventRepository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Abbes on 27/11/2017.
 */
@RestController
public class LoanEventController {

    @Autowired
    private LoanEventRepository loanEventRepository;

    @GetMapping(path = "/getSmallCEPData")
    public @ResponseBody
    int getSmallEvents() {
    	
    	Iterable<LoanEvent> events=  loanEventRepository.findAll();
    	Collection<LoanEvent> smallevents = new ArrayList<LoanEvent>();
    	int i=0,j=0 ;
    	for(LoanEvent ev: events){
    		i++;
    		if(ev.getLoanSum()<=10000)
    			j++;
    			
    	}
    	return j;
    }
    @GetMapping(path = "/getAllCEPData")
    public @ResponseBody
    int getAllEvents() {
    	
    	Iterable<LoanEvent> events=  loanEventRepository.findAll();
    	Collection<LoanEvent> smallevents = new ArrayList<LoanEvent>();
    	int i=0,j=0 ;
    	for(LoanEvent ev: events){
    		i++;

    			
    	}
    	return i;
    }
    
    @GetMapping(path = "/getAverageCEPData")
    public @ResponseBody
    int getAverageEvents() {
    	
    	Iterable<LoanEvent> events=  loanEventRepository.findAll();
    	Collection<LoanEvent> smallevents = new ArrayList<LoanEvent>();
    	int i=0,j=0 ;
    	for(LoanEvent ev: events){
    		i++;
    		if((ev.getLoanSum()>10000) && (ev.getLoanSum()<=100000))
    			j++;
    			
    	}
    	return j;
    }
    
    @GetMapping(path = "/getBigCEPData")
    public @ResponseBody
    int getBigEvents() {
    	
    	Iterable<LoanEvent> events=  loanEventRepository.findAll();
    	Collection<LoanEvent> smallevents = new ArrayList<LoanEvent>();
    	int i=0,j=0 ;
    	for(LoanEvent ev: events){
    		i++;
    		if(ev.getLoanSum()>100000)
    			j++;
    			
    	}
    	return j;
    }
}
