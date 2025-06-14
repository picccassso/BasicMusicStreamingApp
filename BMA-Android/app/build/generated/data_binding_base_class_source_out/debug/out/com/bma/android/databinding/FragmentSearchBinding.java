// Generated by view binder compiler. Do not edit!
package com.bma.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bma.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView recentlyPlayedRecyclerView;

  @NonNull
  public final TextView recentlyPlayedTitle;

  @NonNull
  public final RecyclerView searchResultsRecyclerView;

  @NonNull
  public final SearchView searchView;

  private FragmentSearchBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView recentlyPlayedRecyclerView, @NonNull TextView recentlyPlayedTitle,
      @NonNull RecyclerView searchResultsRecyclerView, @NonNull SearchView searchView) {
    this.rootView = rootView;
    this.recentlyPlayedRecyclerView = recentlyPlayedRecyclerView;
    this.recentlyPlayedTitle = recentlyPlayedTitle;
    this.searchResultsRecyclerView = searchResultsRecyclerView;
    this.searchView = searchView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recently_played_recycler_view;
      RecyclerView recentlyPlayedRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recentlyPlayedRecyclerView == null) {
        break missingId;
      }

      id = R.id.recently_played_title;
      TextView recentlyPlayedTitle = ViewBindings.findChildViewById(rootView, id);
      if (recentlyPlayedTitle == null) {
        break missingId;
      }

      id = R.id.search_results_recycler_view;
      RecyclerView searchResultsRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (searchResultsRecyclerView == null) {
        break missingId;
      }

      id = R.id.search_view;
      SearchView searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      return new FragmentSearchBinding((ConstraintLayout) rootView, recentlyPlayedRecyclerView,
          recentlyPlayedTitle, searchResultsRecyclerView, searchView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
