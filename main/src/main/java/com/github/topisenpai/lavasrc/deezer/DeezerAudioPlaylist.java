package com.github.topisenpai.lavasrc.deezer;

import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import com.sedmelluq.discord.lavaplayer.track.BasicAudioPlaylist;

import java.util.List;

public class DeezerAudioPlaylist extends BasicAudioPlaylist {

    public DeezerAudioPlaylist(String name, List<AudioTrack> tracks) {
        super(name, tracks, null, false);
    }

}