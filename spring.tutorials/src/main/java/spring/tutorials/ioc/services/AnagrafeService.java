package spring.tutorials.ioc.services;

import java.util.List;

public interface AnagrafeService {
     public void add(Anagrafe a) throws AnagrafeException;
     public List<Anagrafe> search(Anagrafe a) throws AnagrafeException;
     public void delete(Anagrafe a) throws AnagrafeException;
     public void update (Anagrafe a) throws AnagrafeException;
}
