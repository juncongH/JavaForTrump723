package Mybatis_superior;

import java.util.List;

/**
 * The interface Dym sql.
 *
 * @Description: 动态SQL
 * @Author hujuncong
 * @Title: DymSQL
 * @Package Mybatis_superior
 * @Date 2022 /5/3 23:04
 */
public interface dymSQL {
    /**
     * Select if list.
     * if语句
     *
     * @param located the located
     * @return the list
     */
    List<College> selectIf(String located);

    /**
     * Select choose list.
     * choose语句
     *
     * @param located the located
     * @return the list
     */
    List<College> selectChoose(String located);
}
