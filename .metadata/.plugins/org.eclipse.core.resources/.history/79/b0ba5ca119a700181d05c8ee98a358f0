package data;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface MovieRepository extends PagingAndSortingRepository<Movie, Long>{
	
	List<Movie> findByLeadActor(@Param("name") String name);
}
