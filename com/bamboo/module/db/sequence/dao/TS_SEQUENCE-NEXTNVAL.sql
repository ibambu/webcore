/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  luotao
 * Created: 2017-3-7
 */

CREATE DEFINER=`root`@`localhost` FUNCTION `nextnval`(seq_name VARCHAR(50),num int) RETURNS int(11)
    DETERMINISTIC
BEGIN
     UPDATE ts_sequence
          SET current_value = current_value + num 
          WHERE name = seq_name; 
     RETURN currval(seq_name); 
END