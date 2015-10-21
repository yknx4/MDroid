package in.co.praveenkumar.mdroid.activity;

import android.os.Bundle;

import in.co.praveenkumar.R;
import in.co.praveenkumar.mdroid.helper.ApplicationClass;
import in.co.praveenkumar.mdroid.helper.Param;

public class CalendarActivity extends BaseNavigationActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calendar);
		setUpDrawer();

		// Send a tracker
		((ApplicationClass) getApplication())
				.sendScreen(Param.GA_SCREEN_CALENDAR);

		getSupportActionBar().setTitle(R.string.title_calendar);
		getSupportActionBar().setIcon(R.drawable.icon_today);
	}
}
