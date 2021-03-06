/***
 * Excerpted from "Stripes: and Java Web Development is Fun Again",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/fdstr for more book information.
***/
package ext;

import java.util.Collection;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.PhoneNumber;
import net.sourceforge.stripes.validation.SimpleError;
import net.sourceforge.stripes.validation.TypeConverter;
import net.sourceforge.stripes.validation.ValidationError;

public class PhoneNumberTypeConverter implements TypeConverter<PhoneNumber> {
    private static final Pattern pattern = Pattern.compile("\\(?(\\d{3})\\)?[-. ]?(\\d{3})[-. ]?(\\d{4})");

    public PhoneNumber convert(String input, Class<? extends PhoneNumber> type, Collection<ValidationError> errors) {
        PhoneNumber result = null;
        
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            result = new PhoneNumber(matcher.group(1), matcher.group(2), matcher.group(3));
            
        } else {
            errors.add(new SimpleError("{1} is not a valid {0}"));
            
        }
        return result;
    }
    
    public void setLocale(Locale locale) {}
    
}