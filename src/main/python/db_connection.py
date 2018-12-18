import psycopg2

def get_connection():
    conn = psycopg2.connect("dbname='jlit' user='postgres' password = 'postgres' host='127.0.0.1' port='5432'")
    return conn
