/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package welding;

import java.sql.*;

/**
 *
 * @author Roman
 */
public interface UserInterface {
     public void SetIndicators(Statement s);
     public void OutputResults(Statement s);
     public boolean checkProcess();
     public void CalculateWelding();
}
