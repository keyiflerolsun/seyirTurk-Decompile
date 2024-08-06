package com.swenauk.mainmenu.Parsers;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import androidx.appcompat.app.AlertDialog;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.util.Util;
import com.swenauk.mainmenu.GetsPack.GetWebteizle;
import com.swenauk.seyirturk.R;
import java.util.Map;

/* loaded from: classes3.dex */
public class Webteizle extends Parsers {
    public boolean isAlt;
    public String mainUrl;
    public String oneLinkWonder;
    public String parsed;

    public Webteizle(String str, Context context, ExoPlayer exoPlayer) {
        super(str, context, exoPlayer);
    }

    @Override // com.swenauk.mainmenu.Parsers.Parsers
    protected void parse(String str) {
        this.isAlt = true;
        new GetWebteizle(this).execute(str);
    }

    public void showAlternates(final Map<String, String> map) {
        if (!((Activity) this.calledContext).isDestroyed()) {
            if (map.size() > 1) {
                final CharSequence[] charSequenceArr = (CharSequence[]) map.keySet().toArray(new CharSequence[map.keySet().size()]);
                AlertDialog.Builder builder = new AlertDialog.Builder(this.calledContext, R.style.AlertDialog);
                builder.setTitle("Kaynak Seçiniz:");
                builder.setItems(charSequenceArr, new DialogInterface.OnClickListener() { // from class: com.swenauk.mainmenu.Parsers.Webteizle.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int r4) {
                        Webteizle.this.mainUrl = (String) map.get(charSequenceArr[r4]);
                        Webteizle.this.isAlt = false;
                        new GetWebteizle(Webteizle.this).execute(Webteizle.this.mainUrl);
                    }
                });
                this.alert = builder.create();
                this.alert.show();
            } else {
                this.isAlt = false;
                new GetWebteizle(this).execute(this.oneLinkWonder);
            }
        }
        this.isAlt = false;
    }

    public void resumeParse() {
        try {
            if (this.mainUrl.contains("s1cdn.vg")) {
                loadS1cdn();
            } else if (this.mainUrl.contains("imdb.com")) {
                loadImdb();
            } else if (this.mainUrl.contains("mail.ru")) {
                loadMailRU();
            } else if (this.mainUrl.contains("startv")) {
                loadStarTV();
            } else if (this.mainUrl.contains("kanald")) {
                loadKanalD();
            } else if (this.mainUrl.contains("showtv")) {
                loadShowTV();
            } else if (this.mainUrl.contains("atv")) {
                loadATV();
            } else if (this.mainUrl.contains("/plus/")) {
                loadDizipubPlus();
            } else if (this.mainUrl.contains("dailymotion")) {
                loadDailyMotion();
            } else {
                if (!this.mainUrl.contains("streamtape") && !this.mainUrl.contains("videobin") && !this.mainUrl.contains("gounlimited") && !this.mainUrl.contains("pornhub") && !this.mainUrl.contains("ashemaletube") && !this.mainUrl.contains("xvideos") && !this.mainUrl.contains("clipwatching") && !this.mainUrl.contains("7dak.com") && !this.mainUrl.contains("xnxx.com") && !this.mainUrl.contains("unlockxh1.com") && !this.mainUrl.contains("xhamster.com")) {
                    if (this.mainUrl.contains("chefkoch24")) {
                        loadYesilcam();
                    } else {
                        if (!this.mainUrl.contains("yabancidizi") && !this.mainUrl.contains("puhutv.com") && !this.mainUrl.contains("teve2") && !this.mainUrl.contains("dizilab") && !this.mainUrl.contains("streamsb") && !this.mainUrl.contains("streamlare")) {
                            if (this.mainUrl.contains("supervideo")) {
                                loadSuper();
                            } else if (this.mainUrl.contains("filmmodu")) {
                                loadFilmModu();
                            } else if (this.mainUrl.contains("uptostream")) {
                                loadUpTo();
                            } else if (this.mainUrl.contains("closeload")) {
                                loadCloseLoad();
                            } else {
                                if (!this.mainUrl.contains("vidmoly") && !this.mainUrl.contains("flmplayer")) {
                                    if (!this.mainUrl.contains("ok.ru") && !this.mainUrl.contains("odnok")) {
                                        if (this.mainUrl.contains("youtube")) {
                                            loadY2Mate();
                                        } else if (this.mainUrl.contains("foxplay")) {
                                            loadFoxPlay();
                                        } else {
                                            if (!this.mainUrl.contains("feurl.com") && !this.mainUrl.contains("fembed.net") && !this.mainUrl.contains("vcdn.io")) {
                                                if (this.mainUrl.contains("yjco.xyz")) {
                                                    loadYjco();
                                                } else {
                                                    if (!this.mainUrl.contains("fileru.net") && !this.mainUrl.contains("file.ru")) {
                                                        if (this.mainUrl.contains(".plus")) {
                                                            loadDiziplus();
                                                        } else if (this.mainUrl.contains("tv8.com.tr")) {
                                                            loadTv8();
                                                        } else if (this.mainUrl.contains("kanal7")) {
                                                            loadDailyMotion();
                                                        } else if (this.mainUrl.contains("k2s")) {
                                                            loadAdult();
                                                        } else if (this.mainUrl.contains("umutdeneme")) {
                                                            loadY2Mate();
                                                        } else {
                                                            if (!this.mainUrl.contains("dizilla") && !this.mainUrl.contains("dizipub")) {
                                                                if (this.mainUrl.contains("dizigom")) {
                                                                    loadDizigom();
                                                                } else {
                                                                    if (!this.mainUrl.contains("contentx") && !this.mainUrl.contains("filese") && !this.mainUrl.contains("playru")) {
                                                                        if (this.mainUrl.contains("fullhdfilmizlesene")) {
                                                                            loadFullhdfilmizlesene();
                                                                        } else if (this.mainUrl.contains("koreanturk")) {
                                                                            loadKoreanturk();
                                                                        } else if (this.mainUrl.contains("unutulmazfilmler")) {
                                                                            loadUnutulmaz();
                                                                        } else if (this.mainUrl.contains("filmakinesi")) {
                                                                            loadFilmakinesi();
                                                                        } else if (this.mainUrl.contains("filemoon")) {
                                                                            loadAdult();
                                                                        }
                                                                    }
                                                                    loadContentx();
                                                                }
                                                            }
                                                            loadDizilla();
                                                        }
                                                    }
                                                    loadFileRU();
                                                }
                                            }
                                            loadFembed();
                                        }
                                    }
                                    loadOkRu();
                                }
                                loadVidMoly();
                            }
                        }
                        loadYabanci();
                    }
                }
                loadAdult();
            }
        } catch (Exception unused) {
            showBuffer();
            showAlert();
        }
    }

    @Override // com.swenauk.mainmenu.Parsers.Parsers
    protected void showVideo() {
        if (this.streamUrl.contains(".mp4") && !this.streamUrl.contains(".m3u8")) {
            if (this.streamUrl.contains("yandex.ru")) {
                this.mediaSource = new ProgressiveMediaSource.Factory(this.dataSourceFactory).createMediaSource(MediaItem.fromUri(this.videoUri));
            } else {
                this.mediaSource = new ProgressiveMediaSource.Factory(new DataSource.Factory() { // from class: com.swenauk.mainmenu.Parsers.Webteizle.2
                    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
                    public DataSource createDataSource() {
                        DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
                        if (Webteizle.this.streamUrl.contains("molyusercontent")) {
                            defaultHttpDataSource.setRequestProperty("Referer", Webteizle.this.videoUri.getScheme() + "://" + Webteizle.this.videoUri.getHost());
                        } else {
                            defaultHttpDataSource.setRequestProperty("Referer", Webteizle.this.videoUri.getScheme() + "://" + Webteizle.this.videoUri.getHost());
                        }
                        return defaultHttpDataSource;
                    }
                }).createMediaSource(MediaItem.fromUri(this.videoUri));
            }
        } else {
            this.mediaSource = new HlsMediaSource.Factory(new DataSource.Factory() { // from class: com.swenauk.mainmenu.Parsers.Webteizle.3
                @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
                public DataSource createDataSource() {
                    DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
                    String str = Webteizle.this.videoUri.getScheme() + "://" + Webteizle.this.videoUri.getHost();
                    if (Webteizle.this.streamUrl.contains("molystream")) {
                        str = Webteizle.this.videoUri.getScheme() + "://" + Webteizle.this.videoUri.getHost();
                    }
                    defaultHttpDataSource.setRequestProperty("Referer", str);
                    return defaultHttpDataSource;
                }
            }).createMediaSource(MediaItem.fromUri(this.videoUri));
        }
        playVideo();
    }

    private void createAlertWItems(String str) {
        if (((Activity) this.calledContext).isDestroyed()) {
            return;
        }
        showBuffer();
        final CharSequence[] charSequenceArr = (CharSequence[]) this.streamUrls.keySet().toArray(new CharSequence[this.streamUrls.keySet().size()]);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.calledContext, R.style.AlertDialog);
        builder.setTitle(str);
        builder.setItems(charSequenceArr, new DialogInterface.OnClickListener() { // from class: com.swenauk.mainmenu.Parsers.Webteizle.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int r4) {
                Webteizle.this.showBuffer();
                System.out.println(Webteizle.this.streamUrls.get(charSequenceArr[r4]));
                Webteizle webteizle = Webteizle.this;
                webteizle.videoUri = Uri.parse(webteizle.streamUrls.get(charSequenceArr[r4]));
                DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(Webteizle.this.calledContext, Util.getUserAgent(Webteizle.this.calledContext, "iFrame"));
                Webteizle.this.mediaSource = new ProgressiveMediaSource.Factory(defaultDataSourceFactory).createMediaSource(MediaItem.fromUri(Webteizle.this.videoUri));
                Webteizle.this.playVideo();
            }
        });
        this.alert = builder.create();
        this.alert.show();
    }

    public void loadContentx() {
        new Contentx(this.mainUrl, this.calledContext, this.player);
    }

    public void loadFilmakinesi() {
        new Webteizle(this.mainUrl, this.calledContext, this.player);
    }

    public void loadUnutulmaz() {
        new Unutulmaz(this.mainUrl, this.calledContext, this.player);
    }

    public void loadKoreanturk() {
        new Koreanturk(this.mainUrl, this.calledContext, this.player);
    }

    public void loadFullhdfilmizlesene() {
        new Fullhdfilmizlesene(this.mainUrl, this.calledContext, this.player);
    }

    public void loadDizigom() {
        new Dizigom(this.mainUrl, this.calledContext, this.player);
    }

    public void loadTv8() {
        new Tv8(this.mainUrl, this.calledContext, this.player);
    }

    public void loadY2Mate() {
        new Y2Mate(this.mainUrl, this.calledContext, this.player);
    }

    public void loadDiziplus() {
        new DiziPlus(this.mainUrl, this.calledContext, this.player);
    }

    public void loadFileRU() {
        new FileRU(this.mainUrl, this.calledContext, this.player);
    }

    public void loadS1cdn() {
        new S1cdn(this.mainUrl, this.calledContext, this.player);
    }

    public void loadCanliTvLive() {
        new CanliTvLive(this.mainUrl, this.calledContext, this.player);
    }

    public void loadFoxPlay() {
        new FoxPlay(this.mainUrl, this.calledContext, this.player);
    }

    public void loadYjco() {
        new Yjco(this.mainUrl, this.calledContext, this.player);
    }

    public void loadFembed() {
        new Fembed(this.mainUrl, this.calledContext, this.player);
    }

    public void loadKarnaval() {
        new KarnavalRadyo(this.mainUrl, this.calledContext, this.player);
    }

    public void loadYabanci() {
        new YabanciDizi(this.mainUrl, this.calledContext, this.player);
    }

    public void loadSuper() {
        new SuperVideo(this.mainUrl, this.calledContext, this.player);
    }

    public void loadUpTo() {
        new UptoStream(this.mainUrl, this.calledContext, this.player);
    }

    public void loadOkRu() {
        new OkRu(this.mainUrl, this.calledContext, this.player);
    }

    public void loadYoutube() {
        new YoutubeWGetter(this.mainUrl, this.calledContext, this.player);
    }

    public void loadVidMoly() {
        new VidMoly(this.mainUrl, this.calledContext, this.player);
    }

    public void loadCloseLoad() {
        new CloseLoad(this.mainUrl, this.calledContext, this.player);
    }

    public void loadFilmModu() {
        new FilmModu(this.mainUrl, this.calledContext, this.player);
    }

    public void loadAdult() {
        new Adult(this.mainUrl, this.calledContext, this.player, false);
    }

    public void loadYesilcam() {
        new Yesilcam(this.mainUrl, this.calledContext, this.player);
    }

    public void loadTrIpTV() {
        new TrIpTv(this.mainUrl, this.calledContext, this.player);
    }

    public void loadImdb() {
        new IMDB(this.mainUrl, this.calledContext, this.player);
    }

    public void loadDizilla() {
        new Dizilla(this.mainUrl, this.calledContext, this.player);
    }

    public void loadDailyMotion() {
        new DailyMotion(this.mainUrl, this.calledContext, this.player);
    }

    public void loadDizipubPlus() {
        new DizipubPlus(this.mainUrl, this.calledContext, this.player);
    }

    public void loadMailRU() {
        new MailRU(this.mainUrl, this.calledContext, this.player);
    }

    public void loadATV() {
        new ATV(this.mainUrl, this.calledContext, this.player);
    }

    public void loadShowTV() {
        new ShowTV(this.mainUrl, this.calledContext, this.player);
    }

    public void loadKanalD() {
        new KanalD(this.mainUrl, this.calledContext, this.player);
    }

    public void loadStarTV() {
        new StarTV(this.mainUrl, this.calledContext, this.player);
    }
}
