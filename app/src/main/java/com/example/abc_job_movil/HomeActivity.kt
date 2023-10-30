package com.example.abc_job_movil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val interviewResultsFragment = InterviewResultsFragment()
        val performanceEvaluationsFragment = PerformanceEvaluationsFragment()
        val scheduledInterviewsFragment = ScheduledInterviewsFragment()
        val teamsFragment = TeamsFragment()
        val technicalResultsFragment = TechnicalResultsFragment()
        val homeFragment = HomeFragment()
        setCurrent(homeFragment)

        findViewById<BottomNavigationView>(R.id.bottomNavigationView).setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.schedule->setCurrent(scheduledInterviewsFragment)
                R.id.interview->setCurrent(interviewResultsFragment)
                R.id.performance->setCurrent(performanceEvaluationsFragment)
                R.id.home->setCurrent(homeFragment)
                R.id.results->setCurrent(teamsFragment)
                R.id.team->setCurrent(technicalResultsFragment)
            }
            true
        }

    }

    private fun setCurrent(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

}