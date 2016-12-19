/**
 * Item 37: Optimize judiciously.
 * 
 * Strive to write good programs rather than fast ones.
 *
 * Strive to avoid design decisions that limit performance.
 *
 * Consider the performance consequences of your API design decisions.
 *
 * It is a very bad idea to warp an API to achieve good performance.
 *
 * Measure performance before and after each attempted optimization.
 *
 * To summarize, do not strive to write fast programs—strive to write good ones; speed will
 * follow. Do think about performance issues while you're designing systems and especially
 * while you're designing APIs, wire-level protocols, and persistent data formats. When you've
 * finished building the system, measure its performance. If it's fast enough, you're done. If not,
 * locate the source of the problems with the aid of a profiler, and go to work optimizing the
 * relevant parts of the system. The first step is to examine your choice of algorithms: No
 * amount of low-level optimization can make up for a poor choice of algorithm. Repeat this
 * process as necessary, measuring the performance after every change, until you're satisfied.
 */
package chapter_7.item_37;