package capybara.racesdispute.hakaton.array;

import android.widget.RelativeLayout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import capybara.racesdispute.hakaton.R;
import capybara.racesdispute.hakaton.admin.Application_admin;

public class request_array extends Application_admin {

    private static RelativeLayout[] relativeArray;

    public RelativeLayout main(@Nullable RelativeLayout rl1) {
        rl1 = findViewById(R.id.rl1);
        return rl1;
    }

}
