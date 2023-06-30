
// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
package lesson2;

import java.text.ParseException;

public class task1 {
public static void main(String[] args) {
        parse("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
    }
    static void parse(String json) {  
try {
            JSONObject rootJsonObject = (JSONObject) parser.parse(json);
            StringBuilder stringBuilder = new StringBuilder("select * from students where ");
            String name = (String) rootJsonObject.get("name");
            if (!name.equals("null")) {
                stringBuilder.append("name = \'" + name + "\'");
    
        }
String country = (String) rootJsonObject.get("country");
            if (!country.equals("null")) {
                stringBuilder.append(" and ");
                stringBuilder.append("country = \'" + country + "\'");
            }

 String city = (String) rootJsonObject.get("city");
            if (!city.equals("null")) {
                stringBuilder.append(" and ");
                stringBuilder.append("city = \'" + city + "\'");
            }
 String age = (String) rootJsonObject.get("age");
            System.out.println(age);
            if (!age.equals("null")) {
                stringBuilder.append(" and ");
                stringBuilder.append("age = \'" + age + "\'");
            }
            String result = stringBuilder.toString();
            System.out.println(result);
        } catch (ParseException e) {
            System.out.println("Ошибка");
        }
    }

}
