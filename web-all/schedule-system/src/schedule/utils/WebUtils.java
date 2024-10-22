package schedule.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import schedule.common.Result;

public class WebUtils {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void writeJson(HttpServletResponse resp, Result result){
        resp.setContentType("application/json;charset=UTF-8");
        try{
            String info = objectMapper.writeValueAsString(result);
            resp.getWriter().write(info);}
        catch(Exception e){
            e.printStackTrace();
        }



    }

}
