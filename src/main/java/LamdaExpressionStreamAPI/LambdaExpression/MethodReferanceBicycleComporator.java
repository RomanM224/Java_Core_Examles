package LamdaExpressionStreamAPI.LambdaExpression;

import java.util.Comparator;

public class MethodReferanceBicycleComporator implements Comparator<MethodReferanceBicycle>{
    
    @Override
    public int compare(MethodReferanceBicycle a, MethodReferanceBicycle b) {
        return a.getFrameSize().compareTo(b.getFrameSize());
    }

}
