/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class libtorrent implements libtorrentConstants {
  public static error_category system_category() {
    return new error_category(libtorrent_jni.system_category(), false);
  }

  public static error_category generic_category() {
    return new error_category(libtorrent_jni.generic_category(), false);
  }

  public static boolean op_eq(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_eq__SWIG_0(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_lt(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_lt__SWIG_0(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_eq__SWIG_1(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_lt(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_lt__SWIG_1(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_neq(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_neq__SWIG_0(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_neq(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_neq__SWIG_1(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_code code, error_condition condition) {
    return libtorrent_jni.op_eq__SWIG_2(error_code.getCPtr(code), code, error_condition.getCPtr(condition), condition);
  }

  public static boolean op_neq(error_code lhs, error_condition rhs) {
    return libtorrent_jni.op_neq__SWIG_2(error_code.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_condition condition, error_code code) {
    return libtorrent_jni.op_eq__SWIG_3(error_condition.getCPtr(condition), condition, error_code.getCPtr(code), code);
  }

  public static boolean op_neq(error_condition lhs, error_code rhs) {
    return libtorrent_jni.op_neq__SWIG_3(error_condition.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static long hash_value(error_code ec) {
    return libtorrent_jni.hash_value(error_code.getCPtr(ec), ec);
  }

  public static error_code make_error_code(errc_t e) {
    return new error_code(libtorrent_jni.make_error_code(e.swigValue()), true);
  }

  public static error_condition make_error_condition(errc_t e) {
    return new error_condition(libtorrent_jni.make_error_condition(e.swigValue()), true);
  }

  public static error_category get_libtorrent_category() {
    return new error_category(libtorrent_jni.get_libtorrent_category(), false);
  }

  public static error_category get_http_category() {
    return new error_category(libtorrent_jni.get_http_category(), false);
  }

  public static error_category get_system_category() {
    return new error_category(libtorrent_jni.get_system_category(), false);
  }

  public static error_category get_posix_category() {
    return new error_category(libtorrent_jni.get_posix_category(), false);
  }

  public static long_long_long_2_pair_vector get_filesizes(file_storage t, String p) {
    return new long_long_long_2_pair_vector(libtorrent_jni.get_filesizes(file_storage.getCPtr(t), t, p), true);
  }

  public static long peer_priority(tcp_endpoint e1, tcp_endpoint e2) {
    return libtorrent_jni.peer_priority(tcp_endpoint.getCPtr(e1), e1, tcp_endpoint.getCPtr(e2), e2);
  }

  public static torrent_handle add_feed_item(session s, feed_item fi, add_torrent_params p) {
    return new torrent_handle(libtorrent_jni.add_feed_item__SWIG_0(session.getCPtr(s), s, feed_item.getCPtr(fi), fi, add_torrent_params.getCPtr(p), p), true);
  }

  public static torrent_handle add_feed_item(session s, feed_item fi, add_torrent_params p, error_code ec) {
    return new torrent_handle(libtorrent_jni.add_feed_item__SWIG_1(session.getCPtr(s), s, feed_item.getCPtr(fi), fi, add_torrent_params.getCPtr(p), p, error_code.getCPtr(ec), ec), true);
  }

  public static int source_rank(int source_bitmask) {
    return libtorrent_jni.source_rank(source_bitmask);
  }

  public static session_settings min_memory_usage() {
    return new session_settings(libtorrent_jni.min_memory_usage(), true);
  }

  public static session_settings high_performance_seed() {
    return new session_settings(libtorrent_jni.high_performance_seed(), true);
  }

  public static int plus_one(int val) {
    return libtorrent_jni.plus_one(val);
  }

  public static int minus_one(int val) {
    return libtorrent_jni.minus_one(val);
  }

  public static String print_entry(lazy_entry e, boolean single_line, int indent) {
    return libtorrent_jni.print_entry__SWIG_0(lazy_entry.getCPtr(e), e, single_line, indent);
  }

  public static String print_entry(lazy_entry e, boolean single_line) {
    return libtorrent_jni.print_entry__SWIG_1(lazy_entry.getCPtr(e), e, single_line);
  }

  public static String print_entry(lazy_entry e) {
    return libtorrent_jni.print_entry__SWIG_2(lazy_entry.getCPtr(e), e);
  }

  public static error_category get_bdecode_category() {
    return new error_category(libtorrent_jni.get_bdecode_category(), false);
  }

  public static String time_now_string() {
    return libtorrent_jni.time_now_string();
  }

  public static String log_time() {
    return libtorrent_jni.log_time();
  }

  public static ptime time_now() {
    return new ptime(libtorrent_jni.time_now(), false);
  }

  public static ptime time_now_hires() {
    return new ptime(libtorrent_jni.time_now_hires(), true);
  }

  public static ptime min_time() {
    return new ptime(libtorrent_jni.min_time(), true);
  }

  public static ptime max_time() {
    return new ptime(libtorrent_jni.max_time(), true);
  }

  public static time_duration seconds(long s) {
    return new time_duration(libtorrent_jni.seconds(s), true);
  }

  public static time_duration milliseconds(long s) {
    return new time_duration(libtorrent_jni.milliseconds(s), true);
  }

  public static time_duration microsec(long s) {
    return new time_duration(libtorrent_jni.microsec(s), true);
  }

  public static time_duration minutes(long s) {
    return new time_duration(libtorrent_jni.minutes(s), true);
  }

  public static time_duration hours(long s) {
    return new time_duration(libtorrent_jni.hours(s), true);
  }

  public static long total_seconds(time_duration td) {
    return libtorrent_jni.total_seconds(time_duration.getCPtr(td), td);
  }

  public static long total_milliseconds(time_duration td) {
    return libtorrent_jni.total_milliseconds(time_duration.getCPtr(td), td);
  }

  public static long total_microseconds(time_duration td) {
    return libtorrent_jni.total_microseconds(time_duration.getCPtr(td), td);
  }

  public static String unescape_string(String s, error_code ec) {
    return libtorrent_jni.unescape_string(s, error_code.getCPtr(ec), ec);
  }

  public static String escape_string(String str, int len) {
    return libtorrent_jni.escape_string(str, len);
  }

  public static String escape_path(String str, int len) {
    return libtorrent_jni.escape_path(str, len);
  }

  public static String maybe_url_encode(String url) {
    return libtorrent_jni.maybe_url_encode(url);
  }

  public static boolean need_encoding(String str, int len) {
    return libtorrent_jni.need_encoding(str, len);
  }

  public static String base64encode(String s) {
    return libtorrent_jni.base64encode(s);
  }

  public static String base32encode(String s) {
    return libtorrent_jni.base32encode(s);
  }

  public static String base32decode(String s) {
    return libtorrent_jni.base32decode(s);
  }

  public static String make_magnet_uri(torrent_handle handle) {
    return libtorrent_jni.make_magnet_uri__SWIG_0(torrent_handle.getCPtr(handle), handle);
  }

  public static String make_magnet_uri(torrent_info info) {
    return libtorrent_jni.make_magnet_uri__SWIG_1(torrent_info.getCPtr(info), info);
  }

  public static void parse_magnet_uri(String uri, add_torrent_params p, error_code ec) {
    libtorrent_jni.parse_magnet_uri(uri, add_torrent_params.getCPtr(p), p, error_code.getCPtr(ec), ec);
  }

  public static void nop(int arg0) {
    libtorrent_jni.nop(arg0);
  }

  public static void add_files(file_storage fs, String file, long flags) {
    libtorrent_jni.add_files__SWIG_2(file_storage.getCPtr(fs), fs, file, flags);
  }

  public static void add_files(file_storage fs, String file) {
    libtorrent_jni.add_files__SWIG_3(file_storage.getCPtr(fs), fs, file);
  }

  public static error_category get_upnp_category() {
    return new error_category(libtorrent_jni.get_upnp_category(), false);
  }

  public static String to_hex(char_vector v) {
    return libtorrent_jni.to_hex(char_vector.getCPtr(v), v);
  }

}
