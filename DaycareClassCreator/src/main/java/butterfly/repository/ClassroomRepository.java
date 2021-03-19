/**@author wuebk - Tyler Wuebker
 * Class : CIS175 Spring 2021
 * Mar 18, 2021
 */
package butterfly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import butterfly.beans.*;

/**
 * @author wuebk
 *
 */
@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

}
