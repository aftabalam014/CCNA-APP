package com.mdaftabalam.ccna.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.mdaftabalam.ccna.R;
import com.mdaftabalam.ccna.adapter.GuideAdapter;
import com.mdaftabalam.ccna.model.GuideModel;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<GuideModel> guidList = new ArrayList<>();
    GuideAdapter adapter;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        guidList.add(new GuideModel("What is a Link?", "At the lowest level, a network can consist of two or nav_more computers" +
                "directly connected by some physical medium such as coaxial cable or optical fiber. Such a physical medium is called as Link."));

        guidList.add(new GuideModel("What is a node?", "A network can consist of two or nav_more computers directly connected by" +
                "some physical medium such as coaxial cable or optical fiber. Such a physical medium is called as Links and the computer " +
                "it connects is called as Nodes."));

        guidList.add(new GuideModel("Define Network?", "A network is a set of devices connected by physical media links. A" +
                "network is recursively is a connection of two or nav_more nodes by a physical link or two or nav_more networks connected by one or nav_more nodes."));

        guidList.add(new GuideModel("What is a gateway or Router?", "A node that is connected to two or nav_more networks is commonly called as" +
                "router or Gateway. It generally forwards message from one network to another."));

        guidList.add(new GuideModel("What is point-point link?", "If the physical links are limited to a pair of nodes it is said to be" +
                "point to point link."));

        guidList.add(new GuideModel("What is Multiple Access?", "If the physical links are shared by nav_more than two nodes, it is said to be" +
                "Multiple Access."));

        guidList.add(new GuideModel("What is Protocol?", "A protocol is a set of rules that govern all aspects of information" +
                "communication."));

        guidList.add(new GuideModel("Define Bandwidth and Latency?", "Network performance is measured in Bandwidth (throughput) and Latency (Delay). " +
                "Bandwidth of a network is given by the number of bits that can be transmitted over the network in a certain period of time. It is strictly " +
                "measured in terms of time."));

        guidList.add(new GuideModel("Define Routing?", "The process of determining systematically hoe to forward messages" +
                "toward the destination nodes based on its address is called routing."));

        guidList.add(new GuideModel("What is a peer-peer process?", "The processes on each machine that communicate at a given layer are" +
                "called peer-peer process."));

        guidList.add(new GuideModel("When a switch is said to be congested?", "It is possible that a switch receives packets faster than the shared link" +
                "can accommodate and stores in its memory, for an extended period of time, then the switch will eventually run out of buffer space, and " +
                "some packets will have to be dropped and in this state is said to congested state."));

        guidList.add(new GuideModel("What is semantic gap?", "Defining a useful channel involves both understanding the applications requirements " +
                "and recognizing the limitations of the underlying technology. The gap between what applications expects and what the underlying technology " +
                "can provide is called semantic gap."));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new GuideAdapter(guidList, GuideActivity.this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.search, menu);
        final MenuItem myMenu = menu.findItem(R.id.search);
        searchView = (SearchView) myMenu.getActionView();
        changeSearchViewTextColor(searchView);
        ((EditText) searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text)).setHintTextColor(getResources().getColor(R.color.white_text));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (!searchView.isIconified()) {
                    searchView.setIconified(true);
                }
                myMenu.collapseActionView();

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                final List<GuideModel> filermodellist = filter(guidList, newText);
                adapter.SearchView(filermodellist);
                return true;
            }
        });

        return true;
    }

    private List<GuideModel> filter(List<GuideModel> p1, String query) {

        query = query.toLowerCase();
        final List<GuideModel> filteredModeList = new ArrayList<>();
        for (GuideModel model : p1) {
            final String text = model.getQuestion().toLowerCase();
            if (text.startsWith(query)) {
                filteredModeList.add(model);

            }
        }
        return filteredModeList;
    }

    private void changeSearchViewTextColor(View view) {
        if (view != null) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(Color.WHITE);
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    changeSearchViewTextColor(viewGroup.getChildAt(i));
                }
            }
        }
    }
}
