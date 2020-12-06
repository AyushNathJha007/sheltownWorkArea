package com.example.blueshelt.Tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class tab_access_adapter  extends FragmentPagerAdapter {
    public tab_access_adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        switch (i){

            case 0:
                PersonalFragment personalFragment = new PersonalFragment();
                return personalFragment;
            case 1:
                LoanFragment loanFragment = new LoanFragment();
                return  loanFragment;

            default:
                return  null;

        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){

            case 0:
                return "Personal";
            case 1:
                return  "Loan";

            default:
                return  null;

        }

    }
}
